# ubb.dp.1819
UBB Design Patterns repository for university year 2018-2019

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
Create a Coffee Service implementation to return an identified coffee material depending on the ingredients given as input

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
Create a Service which, depending on the given priceable parts, creates a priceable with the given components
- use the classes given in the Examples package (to be added on 15.03.2019-18.03.2019)
- print to the output how that priceable would look like 

Ex 2.3. Composite
Create a basic PriceComposite, which has as leaves basic components. 
Define in the Component if the Leaf has a Fixed Price or a calculated Price.
All basic priceable parts will have Fixed prices.
Only the Car root element will have a Computed Price. 
This will be calculated on request via a method invocation on the Composite root, which, 
if the Price is fixed, returns the direct Price of the Component, if the Price should be computed, 
sums up the Prices of the Leaves. 

Ex 2.4 Proxy
Around the Service which creates the priceable, create a Proxy service, which prints all priceable creations, along with their costs.
  
Ex 2.5 Decorator
Add CarDecorations, extending the Car class.
Adapt the CarPricingComposite to take a common (different) Interface, such as the CarPriceable, which can have in its 
leaves both Car Components and Car Decorations. The Car decorations do not add functionality, only cost (The Paint will 
remain a Component, despite not necessarily adding real-world functionality).

The classes are purposefully ambiguous and some Interfaces are purposefully not used in classes. See which are better 
suited for which uses of our exercises. 

Ask your teachers if the instructions are unclear. 
