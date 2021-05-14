package gfg.recursion;

public class minStepsToD3 {
	// Java program to count number of
	// steps to reach a point
	
	/*Given a number line from -infinity to +infinity. You start at 0 and can go either to the left or to the right. 
	 * The condition is that in i’th move, you take i steps. 
a) Find if you can reach a given number x 
b) Find the most optimal way to reach a given number x, if we can indeed reach it. For example, 3 can be reached in 2 steps, (0, 1) (1, 3) and 
4 can be reached in 3 steps (0, -1), (-1, 1) (1, 4).*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dest = 5;
        System.out.println("No. of steps required"+ " to reach " + dest + " is " + steps(0, 0, dest));
	}

	// Function to count number of steps
    // required to reach a destination
     
    // source -> source vertex
    // step -> value of last step taken
    // dest -> destination vertex
    static int steps(int source, int step, int dest)
    {
        // base cases
        if (Math.abs(source) > (dest))
            return Integer.MAX_VALUE;
     
        if (source == dest)
            return step;
 
        // at each point we can go either way
 
        // if we go on positive side
        int pos = steps(source + step + 1, step + 1, dest);
 
        // if we go on negative side
        int neg = steps(source - step - 1, step + 1, dest);
 
        // minimum of both cases
        return Math.min(pos, neg);
    }
}
/*The important thing to note is we can reach any destination as it is always possible to make a move of length 1. At any step i, we can move forward i, then backward i + 1.
Below is a recursive solution suggested by Arpit Thapar here. 
1) Since distance of + 5 and – 5 from 0 is same, hence we find answer for absolute value of destination.

2) We use a recursive function which takes as arguments: 
    i) Source Vertex 
    ii) Value of last step taken 
    iii) Destination

3) If at any point source vertex = destination; return number of steps.

4) Otherwise we can go in both of the possible directions. Take the minimum of steps in both cases.
From any vertex we can go to : 
(current source + last step +1) and 
(current source – last step -1)
5) If at any point, absolute value of our position exceeds the absolute value of our destination then it is intuitive that the shortest path is not possible from here. Hence we make the value of steps INT_MAX, so that when i take the minimum of both possibilities, this one gets eliminated. 

If we don’t use this last step, the program enters into an INFINITE recursion and gives RUN TIME ERROR.

Below is the implementation of above idea. Note that the solution only counts steps.*/


/* Iterative way
 * If target is negative, we can take it as positive because we start from 0 in symmetrical way. 
Idea is to move in one direction as long as possible, this will give minimum moves. Starting at 0 first move takes us to 1, 
second move takes us to 3 (1+2) position, third move takes us to 6 (1+2+3) position, ans so on; So for finding target we keep on adding moves 
until we find the nth move such that 1+2+3+…+n>=target. Now if sum (1+2+3+…+n) is equal to target the our job is done, i.e we’ll need n moves 
to reach target. Now next case where sum is greater than target. Find the difference by how much we are ahead, i.e sum – target. 
Let the difference be d = sum – target. 
If we take the i-th move backward then the new sum will become (sum – 2i), i.e 1+2+3+…-x+x+1…+n. Now if sum-2i = target then our job is done. 
Since, sum – target = 2i, i.e difference should be even as we will get an integer i flipping which will give the answer. So following cases arise. 
Case 1 : Difference is even then answer is n, (because we will always get a move flipping which will lead to target). 
Case 2 : Difference is odd, then we take one more step, i.e add n+1 to sum and now again take the difference. 
If difference is even the n+1 is the answer else we would have to take one more move and this will certainly make the difference even then answer
will be n+2.
Explanation : Since difference is odd. Target is either odd or even. 
case 1: n is even (1+2+3+…+n) then adding n+1 makes the difference even. 
case 2: n is odd then adding n+1 doesn’t makes difference even so we would have to take one more move, so n+2.
Example: 
target = 5. 
we keep on taking moves until we reach target or we just cross it. 
sum = 1 + 2 + 3 = 6 > 5, step = 3. 
Difference = 6 – 5 = 1. Since the difference is an odd value, we will not reach the target by flipping any move from +i to -i. 
So we increase our step. We need to increase step by 2 to get an even difference (since n is odd and target is also odd). 
Now that we have an even difference, we can simply switch any move to the left (i.e. change + to -) as long as the summation of the changed value 
equals to half of the difference. We can switch 1 and 4 or 2 and 3 or 5. 
 */
/*static int reachTarget(int target)
{
// Handling negatives by symmetry
target = Math.abs(target);
 
// Keep moving while sum is smaller
// or difference is odd.
int sum = 0, step = 0;
 
while (sum < target || (sum - target) % 2
                                != 0) {
    step++;
    sum += step;
}
return step;
}*/