

### 4. There is a function called processOrder which takes 6 parameters. Is it a good practice? If not, give the reason and what would be the best practice to follow?
````
processOrder(String customerCode, String CustomerName, String deliveryAddress,BigDecimal unitPrice, int quantity, BigDecimal discountPercentage)
````
>>> This is not a good practice , encapsulate params into a method is totally a waste of efficiency. The good thing is , the clean signature , easy to add other params with the fewest modification . what's the best practice for this kind of problem ?

1. There are three techniques for shortening overly long parameter lists:

    * break the method into multiple methods, each which require only a subset of the parameters
    * create helper classes to hold group of parameters (typically static member classes)
    * adapt the Builder pattern from object construction to method invocation.

        * On the other hand :-
          You can use any number of arguments in a function in java. There is no standard limit to have this number of argument in function in java. as a practice you should not have more than 4 arguments for a function but this is not the standard you can have any number of arguments.