# Avaj Launcher
This project is the introduction to the Java world at [42 Silicon Valley](https://www.42.us.org). The goal was to implement an aircraft simulation program based on the provided UML class diagram. 
![alt text](https://github.com/kdenisova/Screenshots/blob/master/avaj_uml.jpg)

The system monitor can display information about the following modules in the real time:

* Hostname/username module
* OS info module
* Date/Time module
* CPU module
* RAM module
* Network module
* Disks module

Ft_GKrellM works in two different modes:

     -t: text (or terminal) mode

     -g: graphical mode

## Interface

* Terminal mode using [NCURSES](https://en.wikipedia.org/wiki/Ncurses)
* GUI mode using [SFML](https://en.wikipedia.org/wiki/Simple_and_Fast_Multimedia_Library)


## How to use?

1. Install SFML

     `brew install sfml`

2. Build

     `make`

3. Configure

     `Set + for necessary modules at`[config](https://github.com/kdenisova/ft_gkrellm/blob/master/config)`file`

4. Launch

     `LD_LIBRARY_PATH=~/.brew/Cellar/sfml/2.5.1/lib ./ft_gkrellm [-tg]`

## Screenshots

![alt text](https://github.com/kdenisova/Screenshots/blob/master/Modes.png)
