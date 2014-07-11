package br.org.base.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-06T17:07:42")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, BigDecimal> userId;
    public static volatile SingularAttribute<User, String> securityRole;
    public static volatile SingularAttribute<User, String> username;

}