package com.codenotfound.grpc.client;

import javax.annotation.PostConstruct;

import com.codenotfound.grpc.helloworld.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class GrpcClient {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(GrpcClient.class);

    private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build();

        helloWorldServiceBlockingStub =
                HelloWorldServiceGrpc.newBlockingStub(managedChannel);
    }

    public String sayHello(String firstName, String lastName) {
        Person person = Person.newBuilder().setFirstName(firstName)
                .setLastName(lastName).build();

        Greeting greeting =
                helloWorldServiceBlockingStub.sayHello(person);

        return greeting.getMessage();
    }

    public ChamadaUm callChamadaUm() {
        ChamadaUm chamadaUm = ChamadaUm.newBuilder().build();
        return chamadaUm;
    }

    public RetornoLong callChamadaDois(long arg) {
        ChamadaDois chamadaDois = ChamadaDois.newBuilder().setArg1(arg).build();
        RetornoLong retornoLong = RetornoLong.newBuilder().setArg1(1).build();
        return retornoLong;
    }

    public RetornoLong callChamadaTres(long arg1, long arg2, long arg3, long arg4, long arg5, long arg6, long arg7, long arg8) {
        ChamadaTres chamadaTres = ChamadaTres.newBuilder().setArg1(arg1).setArg2(arg2).setArg3(arg3).setArg4(arg4).setArg5(arg5).setArg6(arg6).setArg7(arg7).setArg8(arg8).build();
        RetornoLong retornoLong = RetornoLong.newBuilder().setArg1(1).build();
        return retornoLong;
    }

    public RetornoString callChamadaQuatro(String arg) {
        ChamadaQuatro chamadaQuatro = ChamadaQuatro.newBuilder().setMessage1(arg).build();
        RetornoString retornoLong = RetornoString.newBuilder().setMessage1("retorno string").build();
        return retornoLong;
    }

}
