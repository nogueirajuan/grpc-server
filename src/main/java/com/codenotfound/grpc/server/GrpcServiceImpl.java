package com.codenotfound.grpc.server;

import com.codenotfound.grpc.helloworld.*;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.stub.StreamObserver;

@GRpcService
public class GrpcServiceImpl
        extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(GrpcServiceImpl.class);



    @Override
    public void sayHello(Person request,
                         StreamObserver<Greeting> responseObserver) {

        String message = "Hello " + request.getFirstName() + " "
                + request.getLastName() + "!";
        Greeting greeting =
                Greeting.newBuilder().setMessage(message).build();

        responseObserver.onNext(greeting);
        responseObserver.onCompleted();
    }

    @Override
    public void callChamadaUm(ChamadaUm chamadaUm, StreamObserver<ChamadaUm> responseObserver) {
        LOGGER.info("chamada Um - Sucesso");
        responseObserver.onNext(chamadaUm);
        responseObserver.onCompleted();
    }

    @Override
    public void callChamadaDois(ChamadaDois chamadaDois, StreamObserver<RetornoLong> responseObserver) {
        LOGGER.info("chamada Dois - Sucesso");

        RetornoLong retornoLong = RetornoLong.newBuilder().setArg1(1).build();
        responseObserver.onNext(retornoLong);
        responseObserver.onCompleted();
    }

    @Override
    public void callChamadaTres(ChamadaTres chamadaTres, StreamObserver<RetornoLong> responseObserver) {
        LOGGER.info("chamada Tres - Sucesso");

        RetornoLong retornoLong = RetornoLong.newBuilder().setArg1(1).build();
        responseObserver.onNext(retornoLong);
        responseObserver.onCompleted();
    }

    @Override
    public void callChamadaQuatro(ChamadaQuatro chamadaQuatro, StreamObserver<RetornoString> responseObserver) {
        LOGGER.info("chamada Quatro - Sucesso");

        RetornoString retornoString = RetornoString.newBuilder().setMessage1("resultado").build();
        responseObserver.onNext(retornoString);
        responseObserver.onCompleted();
    }



}
