
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class NotesUrlDetail implements Serializable, Reportable
{

    private static final long serialVersionUID = 4394925284008615588L;
    private String key;
    private String aplication;
    private String date;
    private String correlative;
    private String accountBt;
    private String subAccountBt;
    private String account;
    private String accountName;
    private String telewieseCod;
    private String identity;
    private String client;
    private String pagNumber;
    private String url;

    public NotesUrlDetail(String key, String aplication, String date, String correlative, String accountBt, String subAccountBt, String account,String accountName, String telewieseCod, String identity, String client,
            String pagNumber, String url)
    {
        super();
        this.key = key;
        this.aplication = aplication;
        this.date = date;
        this.correlative = correlative;
        this.accountBt = accountBt;
        this.subAccountBt = subAccountBt;
        this.account = account;
        this.accountName=accountName;
        this.telewieseCod = telewieseCod;
        this.identity = identity;
        this.client = client;
        this.pagNumber = pagNumber;
        this.url = url;
    }

    public NotesUrlDetail()
    {

    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getAplication()
    {
        return aplication;
    }

    public void setAplication(String aplication)
    {
        this.aplication = aplication;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getCorrelative()
    {
        return correlative;
    }

    public void setCorrelative(String correlative)
    {
        this.correlative = correlative;
    }

    public String getAccountBt()
    {
        return accountBt;
    }

    public void setAccountBt(String accountBt)
    {
        this.accountBt = accountBt;
    }

    public String getSubAccountBt()
    {
        return subAccountBt;
    }

    public void setSubAccountBt(String subAccountBt)
    {
        this.subAccountBt = subAccountBt;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getTelewieseCod()
    {
        return telewieseCod;
    }

    public void setTelewieseCod(String telewieseCod)
    {
        this.telewieseCod = telewieseCod;
    }

    public String getIdentity()
    {
        return identity;
    }

    public void setIdentity(String identity)
    {
        this.identity = identity;
    }

    public String getClient()
    {
        return client;
    }

    public void setClient(String client)
    {
        this.client = client;
    }

    public String getPagNumber()
    {
        return pagNumber;
    }

    public void setPagNumber(String pagNumber)
    {
        this.pagNumber = pagNumber;
    }

    public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("NotesUrlDetail [key=");
        builder.append(key);
        builder.append(", aplication=");
        builder.append(aplication);
        builder.append(", date=");
        builder.append(date);
        builder.append(", correlative=");
        builder.append(correlative);
        builder.append(", accountBt=");
        builder.append(accountBt);
        builder.append(", subAccountBt=");
        builder.append(subAccountBt);
        builder.append(", account=");
        builder.append(account);
        builder.append(", telewieseCod=");
        builder.append(telewieseCod);
        builder.append(", identity=");
        builder.append(identity);
        builder.append(", client=");
        builder.append(client);
        builder.append(", pagNumber=");
        builder.append(pagNumber);
        builder.append(", url=");
        builder.append(url);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public String[] getRow()
    {
        return new String[] { date,accountName,account, identity, client, pagNumber };
    }

}
