package com.roroldo.structuralPatterns.adapter.classAdapter;


import com.roroldo.structuralPatterns.adapter.domain.Voltage220;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        int targetVoltage = voltageAdapter.output5();
    }
}
