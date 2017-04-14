package com.laba5;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

/**
 * Created by NAZAR on 02.03.2017.
 */
public class Manager {
    public ArrayList<PassengersTrain> passengersTrains = new ArrayList<PassengersTrain>();
    public ArrayList<SortTrainsByPassengers> train = new ArrayList<SortTrainsByPassengers>();
    public ArrayList<Locomotive> locomotives = new ArrayList<Locomotive>();
    public ArrayList<FreigthTrain> cargo = new ArrayList<FreigthTrain>();

    public Manager() {

    }

    public void createPassengersTrain(){
        PassengersTrain passengersTrain = new PassengersTrain(9,4,2);
        passengersTrain.setNameOfTransport("Kobzar", "Lviv-Zhmerynka");
        TrainPassengers trainPassengers = new TrainPassengers(36,54,12);
        SeatsInWagons seatsInWagons = new SeatsInWagons();
        seatsInWagons.setWagonsSeats(36,54,12);
        Luggage luggage = new Luggage(4,4,2);
        System.out.println("Name of train is : " + passengersTrain.nameOfTransport);
        System.out.println("Route is : " + passengersTrain.route);
        System.out.println("The sum of passengers is : " + trainPassengers.Passengers());
        System.out.println("The sum of luggage is : " + luggage.sumOfLuggage());
        passengersTrains.add(passengersTrain);
    }

    public void createLocomotive(){

        Locomotive locomotive = new Locomotive("Ukraina","Sumy", "Kyiv");
        System.out.println(locomotive.toString());
        locomotives.add(locomotive);
    }

    public void creatCargo(){
        FreigthTrain freigthTrain = new FreigthTrain("Odesa - Chernivtsi", "Diamonds", "TTE16");
        System.out.println(freigthTrain.toString());
        cargo.add(freigthTrain);
    }

    public void sortTrainsByPassengers(){
        train.add(new SortTrainsByPassengers(567));
        train.add(new SortTrainsByPassengers(621));
        train.add(new SortTrainsByPassengers(350));
        train.add(new SortTrainsByPassengers(567));

        Collections.sort(train);
        System.out.println("Trains sorted by number of" + " passengers :  ");
        for (int i = 0; i < train.size(); i++)
            System.out.println("Train №" + i + ") " + train.get(i).getNumOfPassengers());
        System.out.println("___________________________________");
    }





}
