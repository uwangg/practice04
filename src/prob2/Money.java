package prob2;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
        //더하기
    	Money addMoney = new Money(this.amount+money.amount);
    	return addMoney;
    }
    public Money minus( Money money ) {
        //빼기
    	Money minusMoney = new Money(this.amount-money.amount);
    	return minusMoney;
    }
    public Money multiply( Money money ) {
        //곱하기
    	Money mulMoney = new Money(this.amount*money.amount);
    	return mulMoney;
    }
    public Money devide( Money money ) {
        //나누기
    	Money divMoney = new Money(this.amount/money.amount);
    	return divMoney;
    }
    public boolean equals( Object obj ) {
    	if(!(obj instanceof Money))	// obj가 Money인지 먼저 검사
    		return false;
    	
    	Money tmp = (Money)obj;	// obj를 Money로 다운캐스팅
    
    	if(this.amount == tmp.amount)	// amount를 비교
    		return true;
    	else
    		return false;

    }

}
