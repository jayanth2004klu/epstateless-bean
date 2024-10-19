package com.model;

import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
    int add(int a, int b);
    int sub(int a, int b);
}
