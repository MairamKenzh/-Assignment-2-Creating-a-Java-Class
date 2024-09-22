My Plant class represents plants and includes several important characteristics.

Attributes
The class has four attributes:

1. name: the name of the plant.
2. species: the species of the plant.
3. height: the height of the plant in centimeters.
4. isIndoor: indicates whether the plant is suitable for indoor growing.
   
**Constructors**
The class has two constructors:

1. Parameterized Constructor: allows creating a plant object with specified values for all attributes. 
For example, **Plant plant = new Plant("Fern", "Pteridophyta", 25.0, true);**

3. Default Constructor: initializes the attributes with default values (empty strings for name and species, 0.0 for height, and false for isIndoor). This is useful when specific values are not available.

**Methods**
The class includes two methods:

1. **displayInfo():** prints the information about the plant in a formatted way. For example:

Plant Information:
Name: Fern
Species: Pteridophyta
Height: 25.0 cm
Indoor plant: Yes

2. **grow(double growthAmount)**: increases the height of the plant by the specified amount and prints a message about the growth. For example, if growthAmount is 5.0, the output will be: Fern has grown by 5.0 cm.

**Testing the Class**
In the main method, I created three objects of the Plant class:

- One using the default constructor.
- Another using the parameterized constructor.
I called the displayInfo() method for both objects to show their details, and then I used the grow() method on the second object and called displayInfo() again to see the updated height.

Overall, the class meets all the requirements: it defines attributes and methods, includes two constructors, and demonstrates its functionality through the main method.
