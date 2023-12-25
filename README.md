# LAB03
L03Q1

```
MapleStory is an awesome side-scrolling MMORPG where fascinating lore and epic adventures unravel. You will play the role of the legendary warrior Aran, who courageously sealed the almighty Black Mage, a powerful being possessing a different ideology with us so we must unreasonably define him as the villain.
The Aran class will have such properties and behaviours: 
• An empty constructor initializing Aran’s: 
   o level as 300 [-1 < level < 301] 
   o jobAdvancement as -1 [-1 ≤ jobAdvancement < 6] 
   o private static integer [6] jobAdvMap specifying which level should Aran be initialized according 
       to his jobAdvancement 
• A constructor accepting an integer parameter for jobAdvancement and allocate an appropriate level according to jobAdvMap. 
• The level accessor and mutator method where jobAdvancement should be adjusted accordingly too, if necessary, and restricts their magnitude according to the assigned ranges. 
• Aran has gotten her head frozen for a century so she forgot how to properly perform her awesome combos. Program a static boolean isValid(String input) method to return true for such conditions: o Input is a string only consisting of characters ‘B’, ‘P’, ‘T’ and ‘M’ o ‘P’ can only be followed by ‘T’ and ‘T’ can only be followed by ‘M’ o ‘B’ may or may not exists only before ‘P’ 
• A toString method that returns all information as demonstrated in the sample output.
```
