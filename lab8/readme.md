# Input Mask - Design pattern implemented

## Decorator Pattern
I have implemented decorator pattern to append spaces in card number and card expiry date. A Space Decorator wraps the card number and a slash decorator object wraps card expiry date.
When a display method of screen is called, it invokes the display method of subcomponents( space decorator and slash decorator and cvv in this case).
These decorator objects in turn call the display methods of its wrapped objects and append spaces and slash respectively.
