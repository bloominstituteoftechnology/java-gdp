package com.burahan.gdpdemo;

public class CountryNotFoundException extends RuntimeException
{
    public CountryNotFoundException(Long id)
    {
        super("Could not find Country");
    }
}
