package com.roroldo.structuralPatterns.adapter.objectAdapter;

import com.roroldo.structuralPatterns.adapter.domain.Voltage220;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220());
        int targetVoltage = voltageAdapter.output5();
    }
}
