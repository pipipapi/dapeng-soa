 package com.github.dapeng.soa.info.serializer;
        import com.github.dapeng.soa.info.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class InfoSerializer implements BeanSerializer<com.github.dapeng.soa.info.Info>{
        
      @Override
      public com.github.dapeng.soa.info.Info read(TProtocol iprot) throws TException{

      com.github.dapeng.soa.info.Info bean = new com.github.dapeng.soa.info.Info();
      TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setName(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == TType.STRING){
              String elem0 = iprot.readString();
       bean.setCode(elem0);
            }else{
              TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.github.dapeng.soa.info.Info bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new TStruct("Info"));

      
            oprot.writeFieldBegin(new TField("name", TType.STRING, (short) 1));
            String elem0 = bean.getName();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new TField("code", TType.STRING, (short) 2));
            String elem1 = bean.getCode();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.github.dapeng.soa.info.Info bean) throws TException{
      
              if(bean.getName() == null)
              throw new SoaException(SoaBaseCode.NotNull, "name字段不允许为空");
            
              if(bean.getCode() == null)
              throw new SoaException(SoaBaseCode.NotNull, "code字段不允许为空");
            
    }
    
        @Override
        public String toString(com.github.dapeng.soa.info.Info bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      