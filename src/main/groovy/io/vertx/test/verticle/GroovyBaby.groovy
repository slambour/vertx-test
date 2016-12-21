package io.vertx.test.verticle

import io.vertx.core.logging.LoggerFactory
import io.vertx.lang.groovy.GroovyVerticle


class GroovyBaby extends GroovyVerticle {

  def logger = LoggerFactory.getLogger(GroovyBaby.class)

  @Override
  public void start() {
    logger.info("start Verticle")

    // extract configuration
    def config = context.config()
    Map<String, Object> configurationKeys = config.get("keys")

    logger.info("Fact=${configurationKeys.get("fact.chuckNorris")}")
    logger.info("Fact=${configurationKeys.get("fact.jcvd")}")

  }

  @Override
  public void stop() {
    logger.info("Stop")
  }
}
