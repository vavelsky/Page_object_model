package test.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TestPlaylistDelete;
import test.TestPlaylistImport;
import test.TestPlaylistImportFailed;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPlaylistImport.class,
        TestPlaylistImportFailed.class,
        TestPlaylistDelete.class
})
public class TestSuite1 {
}
