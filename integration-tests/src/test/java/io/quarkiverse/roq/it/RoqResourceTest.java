package io.quarkiverse.roq.it;

import static java.nio.file.Files.exists;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.main.Launch;
import io.quarkus.test.junit.main.QuarkusMainTest;

@QuarkusMainTest
public class RoqResourceTest {

    @Test
    @Launch(value = {}, exitCode = 0)
    public void testGenerate() {
        assertTrue(exists(Path.of("target/roq/index.html")));
        assertTrue(exists(Path.of("target/roq/some-page")));
        assertTrue(exists(Path.of("target/roq/roq-name-foo-html/index.html")));
        assertTrue(exists(Path.of("target/roq/roq-name-bar")));
        assertTrue(exists(Path.of("target/roq/roq-name-foo")));
        assertTrue(exists(Path.of("target/roq/assets/vector.svg")));
        assertTrue(exists(Path.of("target/roq/static/logo.svg")));
    }
}
