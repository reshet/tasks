package com.ciklum;


class TryException extends Exception {}
class CatchException extends Exception {}
class FinallyException extends Exception {}

public class Main {


    public static void main(String[] args) throws Exception{
        try {
          throw new TryException();
        }
        catch (Exception ex){
            throw new CatchException();
        }
        finally {
            throw new FinallyException();
        }
    }
}
