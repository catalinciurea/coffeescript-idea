# `cake` is a simplified version of [Make](http://www.gnu.org/software/make/)
# ([Rake](http://rake.rubyforge.org/), [Jake](http://github.com/280north/jake))
# for CoffeeScript. You define tasks with names and descriptions in a Cakefile,
# and can call them from the command line, or invoke them from other tasks.
#
# Running `cake` with no arguments will print out a list of all the tasks in the
# current directory's Cakefile.

# External dependencies.
fs:           require 'fs'
path:         require 'path'
helpers:      require('./helpers').helpers
optparse:     require './optparse'
CoffeeScript: require './coffee-script'

# Keep track of the list of defined tasks, the accepted options, and so on.
tasks: {}
options: {}
switches: []
oparse: null

# Mixin the top-level Cake functions for Cakefiles to use directly.
helpers.extend global, {

  # Define a Cake task with a short name, a sentence description,
  # and the function to run as the action itself.
  task: (name, description, action) ->
    tasks[name]: {name: name, description: description, action: action}

  # Define an option that the Cakefile accepts. The parsed options hash,
  # containing all of the command-line options passed, will be made available
  # as the first argument to the action.
  option: (letter, flag, description) ->
    switches.push [letter, flag, description]

  # Invoke another task in the current Cakefile.
  invoke: (name) ->
    no_such_task name unless tasks[name]
    tasks[name].action options

}

# Run `cake`. Executes all of the tasks you pass, in order. Note that Node's
# asynchrony may cause tasks to execute in a different order than you'd expect.
# If no tasks are passed, print the help screen.
exports.run: ->
  path.exists 'Cakefile', (exists) ->
    throw new Error("Cakefile not found in ${process.cwd()}") unless exists
    args: process.argv[2...process.argv.length]
    CoffeeScript.run fs.readFileSync('Cakefile'), {source: 'Cakefile'}
    oparse: new optparse.OptionParser switches
    return print_tasks() unless args.length
    options: oparse.parse(args)
    invoke arg for arg in options.arguments

# Display the list of Cake tasks in a format similar to `rake -T`
print_tasks: ->
  puts ''
  for name, task of tasks
    spaces: 20 - name.length
    spaces: if spaces > 0 then (' ' for i in [0..spaces]).join('') else ''
    puts "cake $name$spaces # ${task.description}"
  puts oparse.help() if switches.length

# Print an error and exit when attempting to all an undefined task.
no_such_task: (task) ->
  process.stdio.writeError "No such task: \"$task\"\n"
  process.exit 1