package hudson.plugins.s3.callable;

import hudson.util.Secret;

import java.io.Serializable;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;

public class AbstractS3Callable implements Serializable
{
    private static final long serialVersionUID = 1L;

    private transient AmazonS3Client client;

    public AbstractS3Callable(AmazonS3Client client)
    {
        this.client = client;
    }

    protected AmazonS3Client getClient() 
    {
//        if (client == null) {
//            if (useRole) {
//                client = new AmazonS3Client();
//            } else {
//                client = new AmazonS3Client(new BasicAWSCredentials(accessKey, secretKey.getPlainText()));
//            }
//        }
        return client;
    }

}
