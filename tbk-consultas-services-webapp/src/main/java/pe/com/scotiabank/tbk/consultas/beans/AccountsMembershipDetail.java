
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

//@XmlRootElement(name = "AccountsMembershipDetail", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsMembershipDetail", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")

public class AccountsMembershipDetail implements Body, Serializable
{

    private static final long serialVersionUID = -7678263342581440371L;

    // LENGHT ATTRIBUTES
    public static final int TBK_OUPUT_ATTR_LENGTH_MODULE = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_BRANCH_CODE = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_BRANCH_NAME = 30;
    public static final int TBK_OUPUT_ATTR_LENGTH_COIN = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_EQUIVALENT_ACCOUNT = 16;
    public static final int TBK_OUPUT_ATTR_LENGTH_EQUIVALENT_ACCOUNT_HIDDEN = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_PAPER = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_BT_ACCOUNT = 9;
    public static final int TBK_OUPUT_ATTR_LENGTH_OPERATION = 9;
    public static final int TBK_OUPUT_ATTR_LENGTH_SUB_OPERATION = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_OPERATION_TYPE = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_ACCOUNT_TYPE = 20;
    public static final int TBK_OUPUT_ATTR_LENGTH_FLAG = 1;

    private String module;
    private String branchCode;
    private String branchName;
    private String coin;
    private String equivalentAccount;
    private String equivalentAccountHidden;
    private String paper;
    private String btAccount;
    private String operation;
    private String subOperation;
    private String operationType;
    private String accountType;
    private String flag;

    public AccountsMembershipDetail()
    {
    }

    public AccountsMembershipDetail(String output)
    {
        setStringBody(output);
    }

    public String getModule()
    {
        return module;
    }

    public void setModule(String module)
    {
        this.module = module;
    }

    public String getBranchCode()
    {
        return branchCode;
    }

    public void setBranchCode(String branchCode)
    {
        this.branchCode = branchCode;
    }

    public String getBranchName()
    {
        return branchName;
    }

    public void setBranchName(String branchName)
    {
        this.branchName = branchName;
    }

    public String getCoin()
    {
        return coin;
    }

    public void setCoin(String coin)
    {
        this.coin = coin;
    }

    public String getEquivalentAccount()
    {
        return equivalentAccount;
    }

    public void setEquivalentAccount(String equivalentAccount)
    {
        this.equivalentAccount = equivalentAccount;
    }

    public String getEquivalentAccountHidden()
    {
        return equivalentAccountHidden;
    }

    public void setEquivalentAccountHidden(String equivalentAccountHidden)
    {
        this.equivalentAccountHidden = equivalentAccountHidden;
    }

    public String getPaper()
    {
        return paper;
    }

    public void setPaper(String paper)
    {
        this.paper = paper;
    }

    public String getBtAccount()
    {
        return btAccount;
    }

    public void setBtAccount(String btAccount)
    {
        this.btAccount = btAccount;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getSubOperation()
    {
        return subOperation;
    }

    public void setSubOperation(String subOperation)
    {
        this.subOperation = subOperation;
    }

    public String getOperationType()
    {
        return operationType;
    }

    public void setOperationType(String operationType)
    {
        this.operationType = operationType;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public String getFlag()
    {
        return flag;
    }

    public void setFlag(String flag)
    {
        this.flag = flag;
    }

    public AccountsMembershipDetail(String module, String branchCode, String branchName, String coin, String equivalentAccount, String equivalentAccountHidden, String paper, String btAccount,
            String operation, String subOperation, String operationType, String accountType, String flag)
    {
        super();
        this.module = module;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.coin = coin;
        this.equivalentAccount = equivalentAccount;
        this.equivalentAccountHidden = equivalentAccountHidden;
        this.paper = paper;
        this.btAccount = btAccount;
        this.operation = operation;
        this.subOperation = subOperation;
        this.operationType = operationType;
        this.accountType = accountType;
        this.flag = flag;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setModule(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_MODULE));
        setBranchCode(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BRANCH_CODE));
        setBranchName(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BRANCH_NAME));
        setCoin(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_COIN));
        setEquivalentAccount(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_EQUIVALENT_ACCOUNT));
        setEquivalentAccountHidden(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_EQUIVALENT_ACCOUNT_HIDDEN));
        setPaper(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_PAPER));
        setBtAccount(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BT_ACCOUNT));
        setOperation(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_OPERATION));
        setSubOperation(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SUB_OPERATION));
        setOperationType(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_OPERATION_TYPE));
        setAccountType(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_ACCOUNT_TYPE));
        setFlag(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FLAG));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(module);
        builder.append(branchCode);
        builder.append(branchName);
        builder.append(coin);
        builder.append(equivalentAccount);
        builder.append(equivalentAccountHidden);
        builder.append(paper);
        builder.append(btAccount);
        builder.append(operation);
        builder.append(subOperation);
        builder.append(operationType);
        builder.append(accountType);
        builder.append(flag);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountsMembershipDetail [module=");
        builder.append(module);
        builder.append(", branchCode=");
        builder.append(branchCode);
        builder.append(", branchName=");
        builder.append(branchName);
        builder.append(", coin=");
        builder.append(coin);
        builder.append(", equivalentAccount=");
        builder.append(equivalentAccount);
        builder.append(", equivalentAccountHidden=");
        builder.append(equivalentAccountHidden);
        builder.append(", paper=");
        builder.append(paper);
        builder.append(", btAccount=");
        builder.append(btAccount);
        builder.append(", operation=");
        builder.append(operation);
        builder.append(", subOperation=");
        builder.append(subOperation);
        builder.append(", operationType=");
        builder.append(operationType);
        builder.append(", accountType=");
        builder.append(accountType);
        builder.append(", flag=");
        builder.append(flag);
        builder.append("]");
        return builder.toString();
    }

}
