# ubb.dp.1819
UBB Design Patterns repository for university year 2018-2019

#### Git commands to update from remote repo
 
git remote add upstream https://github.com/lzrmihnea/ubb.dp.1819

git fetch upstream 

git pull upstream master

# Lecture Notes
## Introduction to Course
http://www.cs.ubbcluj.ro/~arthur/dp2018/00.Introduction%20to%20Course.pdf

## OOP Recap. SOLID Principles
http://www.cs.ubbcluj.ro/~arthur/dp2018/01.Recap.%20SOLID%20Principles.pdf

## Creational Patterns
http://www.cs.ubbcluj.ro/~arthur/dp2018/02.Creational%20Patterns.pdf

# Laboratories
## Lab 1. Creational Patterns
- Singleton
- Factory
- Builder
- Prototype

### Ex. 1.1. Encapsulation
We will want to read information from a file and interpret this information via a Service.
Using the Single-Responsibility principle from SOLID, please create 2 Services:

- The first Service reads a file and returns all lines in the file in a List of Strings

- The second Service interprets this data as coffee ingredients

-- a line containing only 3 or 4 words is a valid ingredients line. Fewer or more words are invalid.

-- of the 3 or 4 words: 

--- one should be a quantity (200)

--- one should be a unit (ml)

--- one should be an ingredient (milk)

--- the last one is optional and should be an adjective (boiled, steamed, roasted, etc.)


### Ex. 1.2. Coffee Factory
Create a Coffee Service implementation to return an identified coffee type depending on the ingredients given as input

The list of possible coffee types:
- espresso: 2 cups water + 0.25 cups coffee-beans roasted
- cappuccino: 2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk
- americano: 4 cups water + 0.25 cups coffee-beans roasted
- add a coffee of your choosing with name and ingredients

### Ex. 1.3. Coffee Builder
Encapsulate the creation of the coffee with each line of ingredients with a builder. 

## Lab 2. Structural Patterns
- Adapter
- Bridge
- Composite
- Decorator
- Facade

Ex 2.1. Adapter  
Adapt the Service which reads coffee ingredients from a file to read Car Parts
- 4 summer wheels (can be summer or winter)
- 1 titanium chassis (can be titanium, aluminium, vibranium or adamantium)
- 1 electric engine (can be electric, diesel or GPL)
- 1 red paint (can be red, white, black, blue, pink, green, yellow)

Ex 2.2. Bridge 
Create a Service which, depending on the given car parts, creates a car with the given components
- use the classes given in the Examples package (to be added on 15.03.2019-18.03.2019)
- print to the output how that car would look like 

Ex 2.3. Composite
Create a basic PriceComposite, which has as leaves basic components. 
Define in the Component if the Leaf has a Fixed Price or a calculated Price.
All basic car parts will have Fixed prices.
Only the Car root element will have a Computed Price. 
This will be calculated on request via a method invocation on the Composite root, which, 
if the Price is fixed, returns the direct Price of the Component, if the Price should be computed, 
sums up the Prices of the Leaves. 

Ex 2.4 Proxy
Around the Service which creates the car, create a Proxy service, which prints all car creations, along with their costs.
  
Ex 2.5 Decorator
Add CarDecorations, extending the Car class.
Adapt the CarPricingComposite to take a common (different) Interface, such as the CarPriceable, which can have in its 
leaves both Car Components and Car Decorations. The Car decorations do not add functionality, only cost (The Paint will 
remain a Component, despite not necessarily adding real-world functionality).

The classes are purposefully ambiguous and some Interfaces are purposefully not used in classes. See which are better 
suited for which uses of our exercises. 

Ask your teachers if the instructions are unclear. 


## Lab 3. Behavioral patterns (Command, Mediator, Observer)
Chess pieces:
- peon ( 1 square forward movement )
- horse ( L movement )
- bishop ( diagonal movement )

each piece having
- a current position (vert, horiz)
- isAlive
- color (black, white)

### Ex. 3.1. Command pattern
Create movement command classes for each movement 
- peon basic move ( 1 forward ) 
- horse L movement 
- bishop diagonal movement 

Create attack command class:
- attack movement(fromPiece, toPiece)


### Ex. 3.2. Mediator pattern 
Create a Board (Mediator) with dimensions which takes a list of pieces, with positions along with their actions:

The Mediator has always the list of where each piece is 

Each movement of a piece is checked to see if there is already a piece there.

- piece1 move => Mediator checks if there is another piece already there, invokes attack action if there is 
- piece1 move => same thing
- piece2 move => same thing

### Ex. 3.3. Observer pattern 
Observer : interface 
- KillCounterObserver - counts kills
- PrintObserver - simply prints 

Add to the mediator a list of Observers (abstract)

Call the observer list each time an attack appears

Add a third Observer, to your choice
