package com.streammedia.RestApi;

import com.streammedia.entity.BkCategory;
import com.streammedia.perisistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.List;

@Path("bk-categories")
public class BKCategoryResource implements Serializable {
    private GenericDao bkCatgegoryDao = new GenericDao(BkCategory.class);
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response getAllBKCategories(){
        List<BkCategory> categoryList = bkCatgegoryDao.getAll();
        GenericEntity<List<BkCategory>> allCategories =  new GenericEntity<List<BkCategory>>(categoryList) {};
        return Response.ok(allCategories).build();

    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveBkCategory(BkCategory category){
        return Response.ok(bkCatgegoryDao.insert(category)).build();
    }

    @GET
    @Path("{bkCategoryId}")
    public Response getBkCategoryById(@PathParam("bkCategoryId") int id){
        BkCategory cat = (BkCategory)bkCatgegoryDao.getById(id);
        if(!cat.equals(null)){
            return Response.ok(cat).build();
        }
        return Response.noContent().build();
    }


}
