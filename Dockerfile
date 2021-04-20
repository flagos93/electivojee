FROM payara/micro
COPY ./target/electivojee.war $DEPLOY_DIR
