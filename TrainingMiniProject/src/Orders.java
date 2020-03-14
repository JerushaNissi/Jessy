
public class Orders {
	private String orderid;
	private String orderdesc;
	private String totalcost;
	private String disamt;
	public String getOrderid() {
	return orderid;
	}
	public void setOrderid(String orderid) {
	this.orderid = orderid;
	}
	public String getOrderdesc() {
	return orderdesc;
	}
	public void setOrderdesc(String orderdesc) {
	this.orderdesc = orderdesc;
	}
	public String getTotalcost() {
	return totalcost;
	}
	public void setTotalcost(String totalcost) {
	this.totalcost = totalcost;
	}
	public String getDisamt() {
	return disamt;
	}
	public void setDisamt(String disamt) {
	this.disamt = disamt;
	}
	public Orders() {
	super();
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", orderdesc=" + orderdesc + ", totalcost=" + totalcost + ", disamt="
				+ disamt + "]";
	}
}
