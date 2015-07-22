package resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;

@Api("/test/matrix/")
@Path("test/matrix")
public class ResourceWithMatrixParam {
    @ApiOperation(value = "test")
    @GET
    public void getTest(@ApiParam(required = false, defaultValue = "dogs") @DefaultValue("cats") @MatrixParam("isRequired") Boolean isRequired) {
        return;
    }
}