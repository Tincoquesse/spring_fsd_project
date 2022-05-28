package test_package;

import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    public TestComponent() {
        System.out.println("Component Works!");
    }
}
