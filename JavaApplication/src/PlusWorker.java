/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liang
 */


public class PlusWorker extends Worker {


	public Object handle(Object input) {
		
		Integer i =(Integer)input;
		return i*i*i;
	}

	
}
