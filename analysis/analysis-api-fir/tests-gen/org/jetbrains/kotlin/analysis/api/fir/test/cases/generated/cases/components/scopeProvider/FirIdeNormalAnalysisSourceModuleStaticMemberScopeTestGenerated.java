/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.scopeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.scopeProvider.AbstractStaticMemberScopeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleStaticMemberScopeTestGenerated extends AbstractStaticMemberScopeTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInStaticMemberScope() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope/class.kt");
    }

    @Test
    @TestMetadata("classWithJavaSuperclass.kt")
    public void testClassWithJavaSuperclass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope/classWithJavaSuperclass.kt");
    }

    @Test
    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope/enumClass.kt");
    }

    @Test
    @TestMetadata("javaClass.kt")
    public void testJavaClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/staticMemberScope/javaClass.kt");
    }
}
