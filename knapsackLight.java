/* You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?

Note that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.*/

int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
int haul = 0;
if(weight1 + weight2 < maxW || weight1 + weight2 == maxW){
    haul = value1 + value2;
    return haul;
}
if(value1 > value2 && weight1 < maxW){
    haul = value1;
    return haul;
}
if(value2 > value1 && weight2 < maxW){
    haul = value2;
    return haul;
}
if(weight1 < maxW || weight1 == maxW) {
    haul = value1;
    return haul;
}
if(weight2 < maxW || weight2 == maxW) {
    haul = value2;
    return haul;
}
return haul;
}
