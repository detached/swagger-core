package io.swagger.models.parameters;

/**
 * @author <a href="mailto:simon.weis@1und1.de">Simon Weis</a>
 * @since 7/22/15
 */
public class MatrixParameter extends AbstractSerializableParameter<MatrixParameter> {
    public MatrixParameter() {
        super.setIn("matrix");
    }
}
