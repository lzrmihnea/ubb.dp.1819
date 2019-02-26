# ubb.dp.1819
UBB Design Patterns repository for university year 2018-2019


## Lab 1

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
