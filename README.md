# Avaj Launcher
This project is the introduction to the Java world at [42 Silicon Valley](https://www.42.us.org). The goal was to implement an aircraft simulation program based on the provided UML class diagram. 
![alt text](https://github.com/kdenisova/Screenshots/blob/master/avaj_uml.jpg)


## Program behavior
The program takes one argument from the command line. This argument represents the name of a text file that will contain the scenario that needs to be simulated. Executing the program will generate a file simulation.txt that describes the outcome of the simulation.

## Simulation file
The first line of the scenario file contains a positive integer number. This number represents the number of times a weather change is triggered. Each following line describes an aircraft that will be part of the simulation, with this format: 
     
     TYPE NAME LONGITUDE LATITUDE HEIGHT

## Weather generation
There are 4 types of weather:
* RAIN 
* FOG
* SUN
* SNOW

## Aircrafts
There are 3 types of aircraft:
* JetPlane 
* Helicopter
* Balloon

Each aircraft has its own behavior when changing weather conditions.

## Simulation
* Coordinates are positive numbers.
* The height is in the 0-100 range.
* If an aircraft needs to pass the upper limit height it remains at 100.
* Each time an aircraft is created, it receives a unique ID. There can’t be 2 aircrafts with the same ID.
* If an aircraft reaches height 0 or needs to go below it, the aircraft lands, unregisters from the weather tower and logs its current coordinates.
* When a weather change occurs, each aircraft type needs to log a message. 
The message format is:

     TYPE#NAME(UNIQUE_ID): SPECIFIC_MESSAGE

• Each time an aircraft registers or unregisters to/from the weather tower, a message will be logged.

## Implemented design patterns

* [Singleton](https://refactoring.guru/design-patterns/singleton)
* [Observer](https://refactoring.guru/design-patterns/observer)
* [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)


## How to use?

1. Build

     `find . -name "*.java" > sources.txt`
     `javac -d bin -sourcepath com.avaj.AvajLauncher.java @sources.txt`

2. Launch

     `LD_LIBRARY_PATH=~/.brew/Cellar/sfml/2.5.1/lib ./ft_gkrellm [-tg]`

## Screenshots

![alt text](https://github.com/kdenisova/Screenshots/)
