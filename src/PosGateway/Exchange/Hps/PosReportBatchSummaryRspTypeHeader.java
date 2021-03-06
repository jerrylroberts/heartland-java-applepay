package PosGateway.Exchange.Hps;

import java.util.Hashtable;

import org.ksoap2.serialization.*;

import java.math.BigDecimal;

public class PosReportBatchSummaryRspTypeHeader extends AttributeContainer implements KvmSerializable {

    public Integer SiteId = 0;

    public String MerchName;

    public Integer DeviceId = 0;

    public Integer BatchId = 0;

    public String BatchStatus;

    public Integer BatchSeqNbr = 0;

    public java.util.Date OpenUtcDT;

    public java.util.Date CloseUtcDT;

    public Integer OpenTxnId = 0;

    public Integer CloseTxnId;

    public Integer CreditCnt = 0;

    public BigDecimal CreditAmt = BigDecimal.ZERO;

    public Integer DebitCnt = 0;

    public BigDecimal DebitAmt = BigDecimal.ZERO;

    public Integer SaleCnt = 0;

    public BigDecimal SaleAmt = BigDecimal.ZERO;

    public Integer ReturnCnt = 0;

    public BigDecimal ReturnAmt = BigDecimal.ZERO;

    public Integer TotalCnt = 0;

    public BigDecimal TotalAmt = BigDecimal.ZERO;

    public BigDecimal TotalGratuityAmtInfo = BigDecimal.ZERO;

    public PosReportBatchSummaryRspTypeHeader() {
    }

    public PosReportBatchSummaryRspTypeHeader(AttributeContainer inObj, ExtendedSoapSerializationEnvelope envelope) {

        if (inObj == null)
            return;


        SoapObject soapObject = (SoapObject) inObj;
        if (soapObject.hasProperty("SiteId")) {
            Object obj = soapObject.getProperty("SiteId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SiteId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.SiteId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MerchName")) {
            Object obj = soapObject.getProperty("MerchName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.MerchName = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.MerchName = (String) obj;
            }
        }
        if (soapObject.hasProperty("DeviceId")) {
            Object obj = soapObject.getProperty("DeviceId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DeviceId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.DeviceId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("BatchId")) {
            Object obj = soapObject.getProperty("BatchId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.BatchId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.BatchId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("BatchStatus")) {
            Object obj = soapObject.getProperty("BatchStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.BatchStatus = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.BatchStatus = (String) obj;
            }
        }
        if (soapObject.hasProperty("BatchSeqNbr")) {
            Object obj = soapObject.getProperty("BatchSeqNbr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.BatchSeqNbr = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.BatchSeqNbr = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("OpenUtcDT")) {
            Object obj = soapObject.getProperty("OpenUtcDT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.OpenUtcDT = Helper.ConvertFromWebService(j.toString());
                }
            } else if (obj != null && obj instanceof java.util.Date) {
                this.OpenUtcDT = (java.util.Date) obj;
            }
        }
        if (soapObject.hasProperty("CloseUtcDT")) {
            Object obj = soapObject.getProperty("CloseUtcDT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CloseUtcDT = Helper.ConvertFromWebService(j.toString());
                }
            } else if (obj != null && obj instanceof java.util.Date) {
                this.CloseUtcDT = (java.util.Date) obj;
            }
        }
        if (soapObject.hasProperty("OpenTxnId")) {
            Object obj = soapObject.getProperty("OpenTxnId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.OpenTxnId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.OpenTxnId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CloseTxnId")) {
            Object obj = soapObject.getProperty("CloseTxnId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CloseTxnId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.CloseTxnId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreditCnt")) {
            Object obj = soapObject.getProperty("CreditCnt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CreditCnt = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.CreditCnt = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreditAmt")) {
            Object obj = soapObject.getProperty("CreditAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CreditAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.CreditAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("DebitCnt")) {
            Object obj = soapObject.getProperty("DebitCnt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DebitCnt = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.DebitCnt = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("DebitAmt")) {
            Object obj = soapObject.getProperty("DebitAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DebitAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.DebitAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("SaleCnt")) {
            Object obj = soapObject.getProperty("SaleCnt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SaleCnt = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.SaleCnt = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("SaleAmt")) {
            Object obj = soapObject.getProperty("SaleAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SaleAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.SaleAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("ReturnCnt")) {
            Object obj = soapObject.getProperty("ReturnCnt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ReturnCnt = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.ReturnCnt = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ReturnAmt")) {
            Object obj = soapObject.getProperty("ReturnAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ReturnAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.ReturnAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("TotalCnt")) {
            Object obj = soapObject.getProperty("TotalCnt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TotalCnt = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.TotalCnt = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("TotalAmt")) {
            Object obj = soapObject.getProperty("TotalAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TotalAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.TotalAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("TotalGratuityAmtInfo")) {
            Object obj = soapObject.getProperty("TotalGratuityAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TotalGratuityAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.TotalGratuityAmtInfo = (BigDecimal) obj;
            }
        }


    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (propertyIndex == 0) {
            return SiteId;
        }
        if (propertyIndex == 1) {
            return MerchName != null ? MerchName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 2) {
            return DeviceId;
        }
        if (propertyIndex == 3) {
            return BatchId;
        }
        if (propertyIndex == 4) {
            return BatchStatus != null ? BatchStatus : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 5) {
            return BatchSeqNbr;
        }
        if (propertyIndex == 6) {
            return OpenUtcDT;
        }
        if (propertyIndex == 7) {
            return CloseUtcDT != null ? CloseUtcDT : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 8) {
            return OpenTxnId;
        }
        if (propertyIndex == 9) {
            return CloseTxnId != null ? CloseTxnId : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 10) {
            return CreditCnt;
        }
        if (propertyIndex == 11) {
            return CreditAmt != null ? CreditAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 12) {
            return DebitCnt;
        }
        if (propertyIndex == 13) {
            return DebitAmt != null ? DebitAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 14) {
            return SaleCnt;
        }
        if (propertyIndex == 15) {
            return SaleAmt != null ? SaleAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 16) {
            return ReturnCnt;
        }
        if (propertyIndex == 17) {
            return ReturnAmt != null ? ReturnAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 18) {
            return TotalCnt;
        }
        if (propertyIndex == 19) {
            return TotalAmt != null ? TotalAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 20) {
            return TotalGratuityAmtInfo != null ? TotalGratuityAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 21;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "SiteId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 1) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "MerchName";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 2) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "DeviceId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 3) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "BatchId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 4) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BatchStatus";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 5) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "BatchSeqNbr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 6) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "OpenUtcDT";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 7) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CloseUtcDT";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 8) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "OpenTxnId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 9) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "CloseTxnId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 10) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "CreditCnt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 11) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CreditAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 12) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "DebitCnt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 13) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DebitAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 14) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "SaleCnt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 15) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SaleAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 16) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "ReturnCnt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 17) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ReturnAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 18) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "TotalCnt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 19) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TotalAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 20) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TotalGratuityAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
