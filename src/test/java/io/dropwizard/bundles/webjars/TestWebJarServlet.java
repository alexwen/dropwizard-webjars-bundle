package io.dropwizard.bundles.webjars;

import com.google.common.collect.ImmutableList;

import static com.google.common.base.Preconditions.checkNotNull;

public class TestWebJarServlet extends WebJarServlet {
  private static final long serialVersionUID = 0L;
  private static String[] MAVEN_GROUPS = WebJarServlet.DEFAULT_MAVEN_GROUPS;

  static void setMavenGroups(String... groups) {
    MAVEN_GROUPS = checkNotNull(groups);
  }

  static void resetMavenGroups() {
    MAVEN_GROUPS = WebJarServlet.DEFAULT_MAVEN_GROUPS;
  }

  public TestWebJarServlet() {
    super(null, ImmutableList.copyOf(MAVEN_GROUPS), WebJarServlet.DEFAULT_URL_PREFIX);
  }
}
