package kz.springboot.springbootdemo.services;

public interface TestService {
    String getTextData();
    int getTestDataInt();
    void setTestData(String testData);
    void setDataInt(int testDataInt);

    boolean auth(String email, String password);

}
