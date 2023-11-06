package easy;

// 1108. Defanging an IP Address
public class DefangingIpAddress {

    public String defangIPaddr(String address) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (c == '.') answer.append("[.]");
            else answer.append(c);
        }

        return answer.toString();
    }
}
