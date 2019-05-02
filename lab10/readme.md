# Lab 10 

## Feature Aspect Programming

### Output for different feature combinations

* Crank Model with 25 cents.
![alt text](https://github.com/prachichouksey/cmpe202/blob/master/lab10/output/CrankModel-25Cents.png)

* Crank Model with 50 cents.
![alt text](https://github.com/prachichouksey/cmpe202/blob/master/lab10/output/CrankModel-50Cents.png)

* Slot Model with 25 cents.
![alt text](https://github.com/prachichouksey/cmpe202/blob/master/lab10/output/SlotModel-25Cents.png)

* Slot Model with 50 cents.
![alt text](https://github.com/prachichouksey/cmpe202/blob/master/lab10/output/SlotModel-50Cents.png)

# Comparison of GumballMachine(Lab1) and GumballMachineV1(Lab10)

### Lab1

Lab1 was configured to accept the type of gumball machine and implemented to operate based on the same configuration. 
This implementation was done in Object oriented programming.
The limit and current coin value was configured in the gumball machine according to the input. The limitation of this implementation is, it is too complex to change the configurations of the existing machine. The code needs to be changed manually if in future new gumball machine model is introduced.

### Lab 10

Using Eclipse with Feature IDE, a model and config can be used to implement only one of the possible combinations out of crank model and slot model and with valus of 25 cents or 50 cents.
The aspect files are updated in the default package based on the config.

Joint points and advices are used to plug additional behavior to the code.

To conclude, it is easier to add features and configuration in the code using aspects without changing the code.
It is easier to debug using feature ide too.
