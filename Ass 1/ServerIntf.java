import java.rmi.*;

interface ServerIntf extends Remote {

    public int addition(int a, int b) throws RemoteException;

    public int substraction(int a, int b) throws RemoteException;

    public int division(int a, int b) throws RemoteException;

    public int multiplication(int a, int b) throws RemoteException;

    public int square(int a) throws RemoteException;

    public int squareroot(int a) throws RemoteException;

    public void palindrome(String str) throws RemoteException;

    public long calculatePower(int exponent) throws RemoteException;

    public double convertCelsiusToFahrenheit(double celsius) throws RemoteException;
    public double convertMilesToKilometers(double miles) throws RemoteException;

    public String getLargestString(String str1, String str2) throws RemoteException;

    public void isequalstring(String str1, String str2) throws RemoteException;
    
    public String hel(String echo) throws RemoteException;
    
    public int cvwl (String echo) throws RemoteException;
    
    
    public int fct(int fact) throws RemoteException; 

}
