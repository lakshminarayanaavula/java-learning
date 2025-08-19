package com.aln.day2;

import jdk.jfr.DataAmount;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;


public class TicketPriceDto {
    private UUID id;
    private double price;
    private LocalDateTime showTime;
    private LocalDate showDate;
    private String movieName;
    private String theaterName;
    private String language;
}
