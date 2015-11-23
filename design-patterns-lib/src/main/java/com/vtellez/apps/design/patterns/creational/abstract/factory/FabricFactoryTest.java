package abstractfactory;

import com.vtellez.apps.abstractfactory.AbstractFactoryUseCase;
import com.vtellez.apps.abstractfactory.SportFabricFactory;
import com.vtellez.apps.abstractfactory.WorkFabricFactory;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;
import com.vtellez.apps.abstractfactory.product.Cap;
import com.vtellez.apps.abstractfactory.product.Jacket;
import com.vtellez.apps.abstractfactory.product.SportCap;
import com.vtellez.apps.abstractfactory.product.SportJacket;
import com.vtellez.apps.abstractfactory.product.SportTshirt;
import com.vtellez.apps.abstractfactory.product.Tshirt;
import com.vtellez.apps.abstractfactory.product.WorkCap;
import com.vtellez.apps.abstractfactory.product.WorkJacket;
import com.vtellez.apps.abstractfactory.product.WorkTshirt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This is the test to verify the Abstract Factory pattern.
 *
 * Created by Victor Tellez on 17/11/2015.
 */
public class FabricFactoryTest {

    private SportFabricFactory sportFabricFactory;
    private WorkFabricFactory workFabricFactory;
    private AbstractFactoryUseCase abstractFactoryUseCase = new AbstractFactoryUseCase();

    @Before
    public void setUp(){
        sportFabricFactory = abstractFactoryUseCase.getAbstractSportFactoryUseCase();
        workFabricFactory = abstractFactoryUseCase.getAbstractWorkFactoryUseCase();
    }

    @Test
    public void cap(){
        final Cap sportCap = sportFabricFactory.madeCap(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));
        assertTrue(sportCap instanceof SportCap);
        final Cap workCap = workFabricFactory.madeCap(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));
        assertTrue(workCap instanceof WorkCap);
    }

    @Test
    public void jacket(){
        final Jacket sportJacket = sportFabricFactory.madeJacket(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));
        assertTrue(sportJacket instanceof SportJacket);
        final Jacket workJacket = workFabricFactory.madeJacket(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));
        assertTrue(workJacket instanceof WorkJacket);
    }

    @Test
    public void tshirt(){
        final Tshirt sportTshirt = sportFabricFactory.madeTshirt(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));
        assertTrue(sportTshirt instanceof SportTshirt);
        final Tshirt workTshirt = workFabricFactory.madeTshirt(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));
        assertTrue(workTshirt instanceof WorkTshirt);
    }

}
