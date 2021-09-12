package org.codehaus.plexus.compiler.eclipse;

import org.codehaus.plexus.compiler.AbstractCompilerTest;
import org.codehaus.plexus.compiler.CompilerConfiguration;

import java.util.Arrays;
import java.util.Collection;

public class EclipseCompilerFailOnWarningsTest extends AbstractCompilerTest
{

    protected void configureCompilerConfig( CompilerConfiguration compilerConfig )
    {
        compilerConfig.setFailOnWarning(true);
    }

    protected String getRoleHint()
    {
        return "eclipse";
    }

    protected int expectedErrors()
    {
        return 6;
    }

    protected int expectedWarnings()
    {
        return 1;
    }

    protected Collection<String> expectedOutputFiles()
    {
        return Arrays.asList( new String[] {
            "org/codehaus/foo/Deprecation.class",
            "org/codehaus/foo/ExternalDeps.class",
            "org/codehaus/foo/Person.class",
            "org/codehaus/foo/ReservedWord.class"
        });
    }
}
