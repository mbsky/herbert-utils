package net.snake.gamemodel.activities.bean;

import java.util.Comparator;



public class XianshiActivtyControllerComparator implements Comparator<XianshiActivity>{


	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(XianshiActivity o1,
			XianshiActivity o2) {
		if(o1.getOrder()>o2.getOrder()){
			return 1;
		}else{
			return -1;
		}
	}

}
