package ru.m4nveru;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums){
            if (numSet.contains(i)) return true;
            else numSet.add(i);
        }
        return false;
    }
}
