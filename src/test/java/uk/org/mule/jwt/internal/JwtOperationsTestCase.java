package uk.org.mule.jwt.internal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringStartsWith.startsWith;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.junit.Test;

public class JwtOperationsTestCase extends MuleArtifactFunctionalTestCase {

    /**
     * Specifies the mule config xml with the flows that are going to be executed in the tests, this file lives in the test resources.
     */
    @Override
    protected String getConfigFile() {
        return "test-mule-config.xml";
    }

    @Test
    public void fileNotFoundOperation() throws Exception {
        String payloadValue = ((String) flowRunner("file-not-found-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("FILE_NOT_FOUND error raised and handled"));
    }

    @Test
    public void invalidKeyOperation() throws Exception {
        String payloadValue = ((String) flowRunner("invalid-key-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("INVALID_KEY error raised and handled"));
    }

    @Test
    public void invalidPassphraseOperation() throws Exception {
        String payloadValue = ((String) flowRunner("invalid-passphrase-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("INVALID_KEY error raised and handled"));
    }

    @Test
    public void signPKCS1EncryptedRS512Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs1-encrypted-rs512-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS1ES256Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs1-es256-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, startsWith("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS8ES256Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs8-es256-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, startsWith("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS1PS256Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs1-ps256-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, startsWith("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS8PS256Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs8-ps256-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, startsWith("[ENTER VALUE]"));
    }

    @Test
    public void signRS256Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs8-rs256-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("[ENTER VALUE]"));
    }

    @Test
    public void signRS384Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs8-rs384-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS1RS512Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs1-rs512-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("[ENTER VALUE]"));
    }

    @Test
    public void signPKCS8RS512Operation() throws Exception {
        String payloadValue = ((String) flowRunner("sign-pkcs8-rs512-flow")
                .run()
                .getMessage()
                .getPayload()
                .getValue());
        assertThat(payloadValue, is("[ENTER VALUE]"));
    }
}
