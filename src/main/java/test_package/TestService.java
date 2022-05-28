package test_package;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestService() {
        System.out.println("Service Works!");
    }
}
