package com.example.hash;

public class ThreadRunner {

  Distance[] distances = {new Distance(),new Distance(),new Distance()};



  public void startAll(){
    for(Distance d : distances){
      d.start();
    }
  }

  public Distance[] getDistances() {
    return distances;
  }

  class Distance extends Thread {
    double time = 0;


    public void run() {

      for (int i = 0; i < 100; i++) {
        time = Math.random() * (2000 - 10) + 1000;
        try {
          Thread.sleep((long) time);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    public double getTime(){
      return time;
    }

  }
}


