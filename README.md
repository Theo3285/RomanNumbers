# Roman Number
## Definition
Given a positive integer number (eg. 42) determine its Roman numeral representation as a String (eg "XLII"). You cannot write numerals like IM for 999.

### Examples

| Arabic number | Roman numeral  | Arabic number | Roman numeral  | 
| ------------- | -------------- | ------------- | -------------- | 
| 1 | I | 60 | LX | 
| 2 | II | 70 | LXX | 
| 3 | III | 80 | LXXX | 
| 4 | IV | 90 | XC | 
| 5 | V	| 100 | C | 
| 6 | VI | 200  | CC | 
| 7 | VII | 300 | CCC | 
| 8 | VIII | 400 | CD  | 
| 9 | IX | 500 | D | 
| 10 | X | 600 | DC | 
| 20 | XX | 700 | DCC | 
| 30 | XXX | 800 | DCCC | 
| 40 | XL | 900 | CM | 
| 50 | L | 1000 |  M | 


| Arabic number | Roman numeral | Thousands     | Cents         | Thenths       | Units         |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
|       846     |  DCCCXLVI	    |       -	    |       DCC      |               |               |
|      1999     |  MCMXCIX      |       M	    |       CM     |               |               | 
|      2008     |  MMVIII       |       MM	    |       -    |               |               |

Code based on C# implementation taken from [codurance](https://codurance.com/2015/05/18/applying-transformation-priority-premise-to-roman-numerals-kata/)