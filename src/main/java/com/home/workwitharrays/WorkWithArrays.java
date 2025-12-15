/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.workwitharrays;
import java.io.*;

/**
 *
 * @author PC
 */
public class WorkWithArrays 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a count of elements in array");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var nElems = Integer.parseInt(bufStdIn.readLine());
        var iArray = new int[nElems];
        for(int i = 0; i < nElems; i++)
        {
            System.out.printf("Input an element N %d\r\n", i+1);
            iArray[i]=Integer.parseInt(bufStdIn.readLine());
        }
        System.out.println("Inputed array:");
        for(int i=0; i < nElems; i++)
        {
            System.out.print(iArray[i] + " ");
        }
    }
}
