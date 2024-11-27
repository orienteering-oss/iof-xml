
package iofXml.v2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iofXml.v2 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Family_QNAME = new QName("", "Family");
    private static final QName _WebURL_QNAME = new QName("", "WebURL");
    private static final QName _CCardId_QNAME = new QName("", "CCardId");
    private static final QName _RankPosition_QNAME = new QName("", "RankPosition");
    private static final QName _RankValue_QNAME = new QName("", "RankValue");
    private static final QName _EventOfficialRole_QNAME = new QName("", "EventOfficialRole");
    private static final QName _EventRaceId_QNAME = new QName("", "EventRaceId");
    private static final QName _CourseVariationId_QNAME = new QName("", "CourseVariationId");
    private static final QName _ServiceId_QNAME = new QName("", "ServiceId");
    private static final QName _ServiceOrderNumber_QNAME = new QName("", "ServiceOrderNumber");
    private static final QName _EntryId_QNAME = new QName("", "EntryId");
    private static final QName _TeamName_QNAME = new QName("", "TeamName");
    private static final QName _TeamSequence_QNAME = new QName("", "TeamSequence");
    private static final QName _StartNumber_QNAME = new QName("", "StartNumber");
    private static final QName _BibNumber_QNAME = new QName("", "BibNumber");
    private static final QName _StartId_QNAME = new QName("", "StartId");
    private static final QName _ResultPosition_QNAME = new QName("", "ResultPosition");
    private static final QName _StartPointCode_QNAME = new QName("", "StartPointCode");
    private static final QName _SymbolId_QNAME = new QName("", "SymbolId");
    private static final QName _FinishChute_QNAME = new QName("", "FinishChute");
    private static final QName _Sequence_QNAME = new QName("", "Sequence");
    private static final QName _ControlCode_QNAME = new QName("", "ControlCode");
    private static final QName _UnitCode_QNAME = new QName("", "UnitCode");
    private static final QName _PunchPattern_QNAME = new QName("", "PunchPattern");
    private static final QName _FinishPointCode_QNAME = new QName("", "FinishPointCode");
    private static final QName _Scale_QNAME = new QName("", "Scale");
    private static final QName _CourseName_QNAME = new QName("", "CourseName");
    private static final QName _CourseId_QNAME = new QName("", "CourseId");
    private static final QName _CourseSectionId_QNAME = new QName("", "CourseSectionId");
    private static final QName _CourseBranchId_QNAME = new QName("", "CourseBranchId");
    private static final QName _TimeFactor_QNAME = new QName("", "TimeFactor");
    private static final QName _Position_QNAME = new QName("", "Position");
    private static final QName _Info_QNAME = new QName("", "Info");
    private static final QName _FinishId_QNAME = new QName("", "FinishId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iofXml.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IofV2 }
     * 
     * @return
     *     the new instance of {@link IofV2 }
     */
    public IofV2 createIofV2() {
        return new IofV2();
    }

    /**
     * Create an instance of {@link PersonList }
     * 
     * @return
     *     the new instance of {@link PersonList }
     */
    public PersonList createPersonList() {
        return new PersonList();
    }

    /**
     * Create an instance of {@link IOFVersion }
     * 
     * @return
     *     the new instance of {@link IOFVersion }
     */
    public IOFVersion createIOFVersion() {
        return new IOFVersion();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     * @return
     *     the new instance of {@link PersonName }
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link Given }
     * 
     * @return
     *     the new instance of {@link Given }
     */
    public Given createGiven() {
        return new Given();
    }

    /**
     * Create an instance of {@link PersonId }
     * 
     * @return
     *     the new instance of {@link PersonId }
     */
    public PersonId createPersonId() {
        return new PersonId();
    }

    /**
     * Create an instance of {@link BirthDate }
     * 
     * @return
     *     the new instance of {@link BirthDate }
     */
    public BirthDate createBirthDate() {
        return new BirthDate();
    }

    /**
     * Create an instance of {@link Date }
     * 
     * @return
     *     the new instance of {@link Date }
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     * @return
     *     the new instance of {@link AddressType }
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CountryId }
     * 
     * @return
     *     the new instance of {@link CountryId }
     */
    public CountryId createCountryId() {
        return new CountryId();
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @return
     *     the new instance of {@link Country }
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Name }
     * 
     * @return
     *     the new instance of {@link Name }
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ModifyDate }
     * 
     * @return
     *     the new instance of {@link ModifyDate }
     */
    public ModifyDate createModifyDate() {
        return new ModifyDate();
    }

    /**
     * Create an instance of {@link Clock }
     * 
     * @return
     *     the new instance of {@link Clock }
     */
    public Clock createClock() {
        return new Clock();
    }

    /**
     * Create an instance of {@link Tele }
     * 
     * @return
     *     the new instance of {@link Tele }
     */
    public Tele createTele() {
        return new Tele();
    }

    /**
     * Create an instance of {@link TeleType }
     * 
     * @return
     *     the new instance of {@link TeleType }
     */
    public TeleType createTeleType() {
        return new TeleType();
    }

    /**
     * Create an instance of {@link Nationality }
     * 
     * @return
     *     the new instance of {@link Nationality }
     */
    public Nationality createNationality() {
        return new Nationality();
    }

    /**
     * Create an instance of {@link CompetitorList }
     * 
     * @return
     *     the new instance of {@link CompetitorList }
     */
    public CompetitorList createCompetitorList() {
        return new CompetitorList();
    }

    /**
     * Create an instance of {@link Competitor }
     * 
     * @return
     *     the new instance of {@link Competitor }
     */
    public Competitor createCompetitor() {
        return new Competitor();
    }

    /**
     * Create an instance of {@link ClubId }
     * 
     * @return
     *     the new instance of {@link ClubId }
     */
    public ClubId createClubId() {
        return new ClubId();
    }

    /**
     * Create an instance of {@link Club }
     * 
     * @return
     *     the new instance of {@link Club }
     */
    public Club createClub() {
        return new Club();
    }

    /**
     * Create an instance of {@link ShortName }
     * 
     * @return
     *     the new instance of {@link ShortName }
     */
    public ShortName createShortName() {
        return new ShortName();
    }

    /**
     * Create an instance of {@link OrganisationId }
     * 
     * @return
     *     the new instance of {@link OrganisationId }
     */
    public OrganisationId createOrganisationId() {
        return new OrganisationId();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     * @return
     *     the new instance of {@link Contact }
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     * @return
     *     the new instance of {@link ContactType }
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link PreSelectedClass }
     * 
     * @return
     *     the new instance of {@link PreSelectedClass }
     */
    public PreSelectedClass createPreSelectedClass() {
        return new PreSelectedClass();
    }

    /**
     * Create an instance of {@link ClassId }
     * 
     * @return
     *     the new instance of {@link ClassId }
     */
    public ClassId createClassId() {
        return new ClassId();
    }

    /**
     * Create an instance of {@link ClassShortName }
     * 
     * @return
     *     the new instance of {@link ClassShortName }
     */
    public ClassShortName createClassShortName() {
        return new ClassShortName();
    }

    /**
     * Create an instance of {@link Class }
     * 
     * @return
     *     the new instance of {@link Class }
     */
    public Class createClass() {
        return new Class();
    }

    /**
     * Create an instance of {@link ClassTypeId }
     * 
     * @return
     *     the new instance of {@link ClassTypeId }
     */
    public ClassTypeId createClassTypeId() {
        return new ClassTypeId();
    }

    /**
     * Create an instance of {@link ClassType }
     * 
     * @return
     *     the new instance of {@link ClassType }
     */
    public ClassType createClassType() {
        return new ClassType();
    }

    /**
     * Create an instance of {@link SubstituteClass }
     * 
     * @return
     *     the new instance of {@link SubstituteClass }
     */
    public SubstituteClass createSubstituteClass() {
        return new SubstituteClass();
    }

    /**
     * Create an instance of {@link NotQualifiedSubstituteClass }
     * 
     * @return
     *     the new instance of {@link NotQualifiedSubstituteClass }
     */
    public NotQualifiedSubstituteClass createNotQualifiedSubstituteClass() {
        return new NotQualifiedSubstituteClass();
    }

    /**
     * Create an instance of {@link EntryFeeId }
     * 
     * @return
     *     the new instance of {@link EntryFeeId }
     */
    public EntryFeeId createEntryFeeId() {
        return new EntryFeeId();
    }

    /**
     * Create an instance of {@link EntryFee }
     * 
     * @return
     *     the new instance of {@link EntryFee }
     */
    public EntryFee createEntryFee() {
        return new EntryFee();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     * @return
     *     the new instance of {@link Amount }
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link CCard }
     * 
     * @return
     *     the new instance of {@link CCard }
     */
    public CCard createCCard() {
        return new CCard();
    }

    /**
     * Create an instance of {@link PunchingUnitType }
     * 
     * @return
     *     the new instance of {@link PunchingUnitType }
     */
    public PunchingUnitType createPunchingUnitType() {
        return new PunchingUnitType();
    }

    /**
     * Create an instance of {@link Rank }
     * 
     * @return
     *     the new instance of {@link Rank }
     */
    public Rank createRank() {
        return new Rank();
    }

    /**
     * Create an instance of {@link Organisation }
     * 
     * @return
     *     the new instance of {@link Organisation }
     */
    public Organisation createOrganisation() {
        return new Organisation();
    }

    /**
     * Create an instance of {@link OrganisationTypeId }
     * 
     * @return
     *     the new instance of {@link OrganisationTypeId }
     */
    public OrganisationTypeId createOrganisationTypeId() {
        return new OrganisationTypeId();
    }

    /**
     * Create an instance of {@link OrganisationType }
     * 
     * @return
     *     the new instance of {@link OrganisationType }
     */
    public OrganisationType createOrganisationType() {
        return new OrganisationType();
    }

    /**
     * Create an instance of {@link SubOrganisationType }
     * 
     * @return
     *     the new instance of {@link SubOrganisationType }
     */
    public SubOrganisationType createSubOrganisationType() {
        return new SubOrganisationType();
    }

    /**
     * Create an instance of {@link SubOrganisation }
     * 
     * @return
     *     the new instance of {@link SubOrganisation }
     */
    public SubOrganisation createSubOrganisation() {
        return new SubOrganisation();
    }

    /**
     * Create an instance of {@link ValidFromDate }
     * 
     * @return
     *     the new instance of {@link ValidFromDate }
     */
    public ValidFromDate createValidFromDate() {
        return new ValidFromDate();
    }

    /**
     * Create an instance of {@link ValidToDate }
     * 
     * @return
     *     the new instance of {@link ValidToDate }
     */
    public ValidToDate createValidToDate() {
        return new ValidToDate();
    }

    /**
     * Create an instance of {@link RankList }
     * 
     * @return
     *     the new instance of {@link RankList }
     */
    public RankList createRankList() {
        return new RankList();
    }

    /**
     * Create an instance of {@link ClubList }
     * 
     * @return
     *     the new instance of {@link ClubList }
     */
    public ClubList createClubList() {
        return new ClubList();
    }

    /**
     * Create an instance of {@link EventList }
     * 
     * @return
     *     the new instance of {@link EventList }
     */
    public EventList createEventList() {
        return new EventList();
    }

    /**
     * Create an instance of {@link EventClassification }
     * 
     * @return
     *     the new instance of {@link EventClassification }
     */
    public EventClassification createEventClassification() {
        return new EventClassification();
    }

    /**
     * Create an instance of {@link EventClassificationId }
     * 
     * @return
     *     the new instance of {@link EventClassificationId }
     */
    public EventClassificationId createEventClassificationId() {
        return new EventClassificationId();
    }

    /**
     * Create an instance of {@link Event }
     * 
     * @return
     *     the new instance of {@link Event }
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventId }
     * 
     * @return
     *     the new instance of {@link EventId }
     */
    public EventId createEventId() {
        return new EventId();
    }

    /**
     * Create an instance of {@link StartDate }
     * 
     * @return
     *     the new instance of {@link StartDate }
     */
    public StartDate createStartDate() {
        return new StartDate();
    }

    /**
     * Create an instance of {@link FinishDate }
     * 
     * @return
     *     the new instance of {@link FinishDate }
     */
    public FinishDate createFinishDate() {
        return new FinishDate();
    }

    /**
     * Create an instance of {@link EventOfficial }
     * 
     * @return
     *     the new instance of {@link EventOfficial }
     */
    public EventOfficial createEventOfficial() {
        return new EventOfficial();
    }

    /**
     * Create an instance of {@link Organiser }
     * 
     * @return
     *     the new instance of {@link Organiser }
     */
    public Organiser createOrganiser() {
        return new Organiser();
    }

    /**
     * Create an instance of {@link EventClass }
     * 
     * @return
     *     the new instance of {@link EventClass }
     */
    public EventClass createEventClass() {
        return new EventClass();
    }

    /**
     * Create an instance of {@link ClassRaceInfo }
     * 
     * @return
     *     the new instance of {@link ClassRaceInfo }
     */
    public ClassRaceInfo createClassRaceInfo() {
        return new ClassRaceInfo();
    }

    /**
     * Create an instance of {@link FirstStart }
     * 
     * @return
     *     the new instance of {@link FirstStart }
     */
    public FirstStart createFirstStart() {
        return new FirstStart();
    }

    /**
     * Create an instance of {@link StartInterval }
     * 
     * @return
     *     the new instance of {@link StartInterval }
     */
    public StartInterval createStartInterval() {
        return new StartInterval();
    }

    /**
     * Create an instance of {@link Time }
     * 
     * @return
     *     the new instance of {@link Time }
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link EstimatedBestTime }
     * 
     * @return
     *     the new instance of {@link EstimatedBestTime }
     */
    public EstimatedBestTime createEstimatedBestTime() {
        return new EstimatedBestTime();
    }

    /**
     * Create an instance of {@link EstimatedLastPrizeTime }
     * 
     * @return
     *     the new instance of {@link EstimatedLastPrizeTime }
     */
    public EstimatedLastPrizeTime createEstimatedLastPrizeTime() {
        return new EstimatedLastPrizeTime();
    }

    /**
     * Create an instance of {@link PrizeCeremonyTime }
     * 
     * @return
     *     the new instance of {@link PrizeCeremonyTime }
     */
    public PrizeCeremonyTime createPrizeCeremonyTime() {
        return new PrizeCeremonyTime();
    }

    /**
     * Create an instance of {@link AllocationMethod }
     * 
     * @return
     *     the new instance of {@link AllocationMethod }
     */
    public AllocationMethod createAllocationMethod() {
        return new AllocationMethod();
    }

    /**
     * Create an instance of {@link StartMethod }
     * 
     * @return
     *     the new instance of {@link StartMethod }
     */
    public StartMethod createStartMethod() {
        return new StartMethod();
    }

    /**
     * Create an instance of {@link ClassRaceStatus }
     * 
     * @return
     *     the new instance of {@link ClassRaceStatus }
     */
    public ClassRaceStatus createClassRaceStatus() {
        return new ClassRaceStatus();
    }

    /**
     * Create an instance of {@link TransferedToClass }
     * 
     * @return
     *     the new instance of {@link TransferedToClass }
     */
    public TransferedToClass createTransferedToClass() {
        return new TransferedToClass();
    }

    /**
     * Create an instance of {@link DividedIntoClass }
     * 
     * @return
     *     the new instance of {@link DividedIntoClass }
     */
    public DividedIntoClass createDividedIntoClass() {
        return new DividedIntoClass();
    }

    /**
     * Create an instance of {@link EventRace }
     * 
     * @return
     *     the new instance of {@link EventRace }
     */
    public EventRace createEventRace() {
        return new EventRace();
    }

    /**
     * Create an instance of {@link RaceDate }
     * 
     * @return
     *     the new instance of {@link RaceDate }
     */
    public RaceDate createRaceDate() {
        return new RaceDate();
    }

    /**
     * Create an instance of {@link EntryData }
     * 
     * @return
     *     the new instance of {@link EntryData }
     */
    public EntryData createEntryData() {
        return new EntryData();
    }

    /**
     * Create an instance of {@link Service }
     * 
     * @return
     *     the new instance of {@link Service }
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     * @return
     *     the new instance of {@link Comment }
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link MaxNumber }
     * 
     * @return
     *     the new instance of {@link MaxNumber }
     */
    public MaxNumber createMaxNumber() {
        return new MaxNumber();
    }

    /**
     * Create an instance of {@link ServiceRequestList }
     * 
     * @return
     *     the new instance of {@link ServiceRequestList }
     */
    public ServiceRequestList createServiceRequestList() {
        return new ServiceRequestList();
    }

    /**
     * Create an instance of {@link ClubServiceRequest }
     * 
     * @return
     *     the new instance of {@link ClubServiceRequest }
     */
    public ClubServiceRequest createClubServiceRequest() {
        return new ClubServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     * @return
     *     the new instance of {@link ServiceRequest }
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link RequestedQuantity }
     * 
     * @return
     *     the new instance of {@link RequestedQuantity }
     */
    public RequestedQuantity createRequestedQuantity() {
        return new RequestedQuantity();
    }

    /**
     * Create an instance of {@link DeliveredQuantity }
     * 
     * @return
     *     the new instance of {@link DeliveredQuantity }
     */
    public DeliveredQuantity createDeliveredQuantity() {
        return new DeliveredQuantity();
    }

    /**
     * Create an instance of {@link PersonServiceRequest }
     * 
     * @return
     *     the new instance of {@link PersonServiceRequest }
     */
    public PersonServiceRequest createPersonServiceRequest() {
        return new PersonServiceRequest();
    }

    /**
     * Create an instance of {@link OrganisationServiceRequest }
     * 
     * @return
     *     the new instance of {@link OrganisationServiceRequest }
     */
    public OrganisationServiceRequest createOrganisationServiceRequest() {
        return new OrganisationServiceRequest();
    }

    /**
     * Create an instance of {@link EntryList }
     * 
     * @return
     *     the new instance of {@link EntryList }
     */
    public EntryList createEntryList() {
        return new EntryList();
    }

    /**
     * Create an instance of {@link ClubEntry }
     * 
     * @return
     *     the new instance of {@link ClubEntry }
     */
    public ClubEntry createClubEntry() {
        return new ClubEntry();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     * @return
     *     the new instance of {@link Entry }
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link EntryClass }
     * 
     * @return
     *     the new instance of {@link EntryClass }
     */
    public EntryClass createEntryClass() {
        return new EntryClass();
    }

    /**
     * Create an instance of {@link AllocationControl }
     * 
     * @return
     *     the new instance of {@link AllocationControl }
     */
    public AllocationControl createAllocationControl() {
        return new AllocationControl();
    }

    /**
     * Create an instance of {@link AllocationControlType }
     * 
     * @return
     *     the new instance of {@link AllocationControlType }
     */
    public AllocationControlType createAllocationControlType() {
        return new AllocationControlType();
    }

    /**
     * Create an instance of {@link EntryDate }
     * 
     * @return
     *     the new instance of {@link EntryDate }
     */
    public EntryDate createEntryDate() {
        return new EntryDate();
    }

    /**
     * Create an instance of {@link StartList }
     * 
     * @return
     *     the new instance of {@link StartList }
     */
    public StartList createStartList() {
        return new StartList();
    }

    /**
     * Create an instance of {@link ClassStart }
     * 
     * @return
     *     the new instance of {@link ClassStart }
     */
    public ClassStart createClassStart() {
        return new ClassStart();
    }

    /**
     * Create an instance of {@link PersonStart }
     * 
     * @return
     *     the new instance of {@link PersonStart }
     */
    public PersonStart createPersonStart() {
        return new PersonStart();
    }

    /**
     * Create an instance of {@link Start }
     * 
     * @return
     *     the new instance of {@link Start }
     */
    public Start createStart() {
        return new Start();
    }

    /**
     * Create an instance of {@link StartTime }
     * 
     * @return
     *     the new instance of {@link StartTime }
     */
    public StartTime createStartTime() {
        return new StartTime();
    }

    /**
     * Create an instance of {@link CourseLength }
     * 
     * @return
     *     the new instance of {@link CourseLength }
     */
    public CourseLength createCourseLength() {
        return new CourseLength();
    }

    /**
     * Create an instance of {@link RaceStart }
     * 
     * @return
     *     the new instance of {@link RaceStart }
     */
    public RaceStart createRaceStart() {
        return new RaceStart();
    }

    /**
     * Create an instance of {@link TeamStart }
     * 
     * @return
     *     the new instance of {@link TeamStart }
     */
    public TeamStart createTeamStart() {
        return new TeamStart();
    }

    /**
     * Create an instance of {@link ResultList }
     * 
     * @return
     *     the new instance of {@link ResultList }
     */
    public ResultList createResultList() {
        return new ResultList();
    }

    /**
     * Create an instance of {@link ClassResult }
     * 
     * @return
     *     the new instance of {@link ClassResult }
     */
    public ClassResult createClassResult() {
        return new ClassResult();
    }

    /**
     * Create an instance of {@link PersonResult }
     * 
     * @return
     *     the new instance of {@link PersonResult }
     */
    public PersonResult createPersonResult() {
        return new PersonResult();
    }

    /**
     * Create an instance of {@link Result }
     * 
     * @return
     *     the new instance of {@link Result }
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link FinishTime }
     * 
     * @return
     *     the new instance of {@link FinishTime }
     */
    public FinishTime createFinishTime() {
        return new FinishTime();
    }

    /**
     * Create an instance of {@link CompetitorStatus }
     * 
     * @return
     *     the new instance of {@link CompetitorStatus }
     */
    public CompetitorStatus createCompetitorStatus() {
        return new CompetitorStatus();
    }

    /**
     * Create an instance of {@link CourseVariation }
     * 
     * @return
     *     the new instance of {@link CourseVariation }
     */
    public CourseVariation createCourseVariation() {
        return new CourseVariation();
    }

    /**
     * Create an instance of {@link CourseClimb }
     * 
     * @return
     *     the new instance of {@link CourseClimb }
     */
    public CourseClimb createCourseClimb() {
        return new CourseClimb();
    }

    /**
     * Create an instance of {@link StartPoint }
     * 
     * @return
     *     the new instance of {@link StartPoint }
     */
    public StartPoint createStartPoint() {
        return new StartPoint();
    }

    /**
     * Create an instance of {@link Description }
     * 
     * @return
     *     the new instance of {@link Description }
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Box }
     * 
     * @return
     *     the new instance of {@link Box }
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     * @return
     *     the new instance of {@link Symbol }
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link Text }
     * 
     * @return
     *     the new instance of {@link Text }
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link ControlPosition }
     * 
     * @return
     *     the new instance of {@link ControlPosition }
     */
    public ControlPosition createControlPosition() {
        return new ControlPosition();
    }

    /**
     * Create an instance of {@link MapPosition }
     * 
     * @return
     *     the new instance of {@link MapPosition }
     */
    public MapPosition createMapPosition() {
        return new MapPosition();
    }

    /**
     * Create an instance of {@link DistanceFromStart }
     * 
     * @return
     *     the new instance of {@link DistanceFromStart }
     */
    public DistanceFromStart createDistanceFromStart() {
        return new DistanceFromStart();
    }

    /**
     * Create an instance of {@link CourseControl }
     * 
     * @return
     *     the new instance of {@link CourseControl }
     */
    public CourseControl createCourseControl() {
        return new CourseControl();
    }

    /**
     * Create an instance of {@link Control }
     * 
     * @return
     *     the new instance of {@link Control }
     */
    public Control createControl() {
        return new Control();
    }

    /**
     * Create an instance of {@link PunchingUnit }
     * 
     * @return
     *     the new instance of {@link PunchingUnit }
     */
    public PunchingUnit createPunchingUnit() {
        return new PunchingUnit();
    }

    /**
     * Create an instance of {@link LegLength }
     * 
     * @return
     *     the new instance of {@link LegLength }
     */
    public LegLength createLegLength() {
        return new LegLength();
    }

    /**
     * Create an instance of {@link MapTextPosition }
     * 
     * @return
     *     the new instance of {@link MapTextPosition }
     */
    public MapTextPosition createMapTextPosition() {
        return new MapTextPosition();
    }

    /**
     * Create an instance of {@link FinishPoint }
     * 
     * @return
     *     the new instance of {@link FinishPoint }
     */
    public FinishPoint createFinishPoint() {
        return new FinishPoint();
    }

    /**
     * Create an instance of {@link DistanceToFinish }
     * 
     * @return
     *     the new instance of {@link DistanceToFinish }
     */
    public DistanceToFinish createDistanceToFinish() {
        return new DistanceToFinish();
    }

    /**
     * Create an instance of {@link SplitTime }
     * 
     * @return
     *     the new instance of {@link SplitTime }
     */
    public SplitTime createSplitTime() {
        return new SplitTime();
    }

    /**
     * Create an instance of {@link BadgeValueId }
     * 
     * @return
     *     the new instance of {@link BadgeValueId }
     */
    public BadgeValueId createBadgeValueId() {
        return new BadgeValueId();
    }

    /**
     * Create an instance of {@link BadgeValue }
     * 
     * @return
     *     the new instance of {@link BadgeValue }
     */
    public BadgeValue createBadgeValue() {
        return new BadgeValue();
    }

    /**
     * Create an instance of {@link Point }
     * 
     * @return
     *     the new instance of {@link Point }
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link RaceResult }
     * 
     * @return
     *     the new instance of {@link RaceResult }
     */
    public RaceResult createRaceResult() {
        return new RaceResult();
    }

    /**
     * Create an instance of {@link TeamResult }
     * 
     * @return
     *     the new instance of {@link TeamResult }
     */
    public TeamResult createTeamResult() {
        return new TeamResult();
    }

    /**
     * Create an instance of {@link TeamStatus }
     * 
     * @return
     *     the new instance of {@link TeamStatus }
     */
    public TeamStatus createTeamStatus() {
        return new TeamStatus();
    }

    /**
     * Create an instance of {@link ClassData }
     * 
     * @return
     *     the new instance of {@link ClassData }
     */
    public ClassData createClassData() {
        return new ClassData();
    }

    /**
     * Create an instance of {@link CourseData }
     * 
     * @return
     *     the new instance of {@link CourseData }
     */
    public CourseData createCourseData() {
        return new CourseData();
    }

    /**
     * Create an instance of {@link Map }
     * 
     * @return
     *     the new instance of {@link Map }
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link Course }
     * 
     * @return
     *     the new instance of {@link Course }
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link CourseSectionList }
     * 
     * @return
     *     the new instance of {@link CourseSectionList }
     */
    public CourseSectionList createCourseSectionList() {
        return new CourseSectionList();
    }

    /**
     * Create an instance of {@link CourseSection }
     * 
     * @return
     *     the new instance of {@link CourseSection }
     */
    public CourseSection createCourseSection() {
        return new CourseSection();
    }

    /**
     * Create an instance of {@link CourseBranch }
     * 
     * @return
     *     the new instance of {@link CourseBranch }
     */
    public CourseBranch createCourseBranch() {
        return new CourseBranch();
    }

    /**
     * Create an instance of {@link BadgeList }
     * 
     * @return
     *     the new instance of {@link BadgeList }
     */
    public BadgeList createBadgeList() {
        return new BadgeList();
    }

    /**
     * Create an instance of {@link BadgeLimit }
     * 
     * @return
     *     the new instance of {@link BadgeLimit }
     */
    public BadgeLimit createBadgeLimit() {
        return new BadgeLimit();
    }

    /**
     * Create an instance of {@link ResultSelection }
     * 
     * @return
     *     the new instance of {@link ResultSelection }
     */
    public ResultSelection createResultSelection() {
        return new ResultSelection();
    }

    /**
     * Create an instance of {@link OrganisationList }
     * 
     * @return
     *     the new instance of {@link OrganisationList }
     */
    public OrganisationList createOrganisationList() {
        return new OrganisationList();
    }

    /**
     * Create an instance of {@link Press }
     * 
     * @return
     *     the new instance of {@link Press }
     */
    public Press createPress() {
        return new Press();
    }

    /**
     * Create an instance of {@link PressList }
     * 
     * @return
     *     the new instance of {@link PressList }
     */
    public PressList createPressList() {
        return new PressList();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     * @return
     *     the new instance of {@link Transaction }
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link ForeignAccount }
     * 
     * @return
     *     the new instance of {@link ForeignAccount }
     */
    public ForeignAccount createForeignAccount() {
        return new ForeignAccount();
    }

    /**
     * Create an instance of {@link TransactionList }
     * 
     * @return
     *     the new instance of {@link TransactionList }
     */
    public TransactionList createTransactionList() {
        return new TransactionList();
    }

    /**
     * Create an instance of {@link CountryList }
     * 
     * @return
     *     the new instance of {@link CountryList }
     */
    public CountryList createCountryList() {
        return new CountryList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Family")
    public JAXBElement<String> createFamily(String value) {
        return new JAXBElement<>(_Family_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "WebURL")
    public JAXBElement<String> createWebURL(String value) {
        return new JAXBElement<>(_WebURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CCardId")
    public JAXBElement<String> createCCardId(String value) {
        return new JAXBElement<>(_CCardId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RankPosition")
    public JAXBElement<String> createRankPosition(String value) {
        return new JAXBElement<>(_RankPosition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RankValue")
    public JAXBElement<String> createRankValue(String value) {
        return new JAXBElement<>(_RankValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EventOfficialRole")
    public JAXBElement<String> createEventOfficialRole(String value) {
        return new JAXBElement<>(_EventOfficialRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EventRaceId")
    public JAXBElement<String> createEventRaceId(String value) {
        return new JAXBElement<>(_EventRaceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CourseVariationId")
    public JAXBElement<String> createCourseVariationId(String value) {
        return new JAXBElement<>(_CourseVariationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ServiceId")
    public JAXBElement<String> createServiceId(String value) {
        return new JAXBElement<>(_ServiceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ServiceOrderNumber")
    public JAXBElement<String> createServiceOrderNumber(String value) {
        return new JAXBElement<>(_ServiceOrderNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EntryId")
    public JAXBElement<String> createEntryId(String value) {
        return new JAXBElement<>(_EntryId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TeamName")
    public JAXBElement<String> createTeamName(String value) {
        return new JAXBElement<>(_TeamName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TeamSequence")
    public JAXBElement<String> createTeamSequence(String value) {
        return new JAXBElement<>(_TeamSequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StartNumber")
    public JAXBElement<String> createStartNumber(String value) {
        return new JAXBElement<>(_StartNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BibNumber")
    public JAXBElement<String> createBibNumber(String value) {
        return new JAXBElement<>(_BibNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StartId")
    public JAXBElement<String> createStartId(String value) {
        return new JAXBElement<>(_StartId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ResultPosition")
    public JAXBElement<String> createResultPosition(String value) {
        return new JAXBElement<>(_ResultPosition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StartPointCode")
    public JAXBElement<String> createStartPointCode(String value) {
        return new JAXBElement<>(_StartPointCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SymbolId")
    public JAXBElement<String> createSymbolId(String value) {
        return new JAXBElement<>(_SymbolId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FinishChute")
    public JAXBElement<String> createFinishChute(String value) {
        return new JAXBElement<>(_FinishChute_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Sequence")
    public JAXBElement<String> createSequence(String value) {
        return new JAXBElement<>(_Sequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ControlCode")
    public JAXBElement<String> createControlCode(String value) {
        return new JAXBElement<>(_ControlCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UnitCode")
    public JAXBElement<String> createUnitCode(String value) {
        return new JAXBElement<>(_UnitCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PunchPattern")
    public JAXBElement<String> createPunchPattern(String value) {
        return new JAXBElement<>(_PunchPattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FinishPointCode")
    public JAXBElement<String> createFinishPointCode(String value) {
        return new JAXBElement<>(_FinishPointCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Scale")
    public JAXBElement<String> createScale(String value) {
        return new JAXBElement<>(_Scale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CourseName")
    public JAXBElement<String> createCourseName(String value) {
        return new JAXBElement<>(_CourseName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CourseId")
    public JAXBElement<String> createCourseId(String value) {
        return new JAXBElement<>(_CourseId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CourseSectionId")
    public JAXBElement<String> createCourseSectionId(String value) {
        return new JAXBElement<>(_CourseSectionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CourseBranchId")
    public JAXBElement<String> createCourseBranchId(String value) {
        return new JAXBElement<>(_CourseBranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TimeFactor")
    public JAXBElement<String> createTimeFactor(String value) {
        return new JAXBElement<>(_TimeFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Position")
    public JAXBElement<String> createPosition(String value) {
        return new JAXBElement<>(_Position_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Info")
    public JAXBElement<String> createInfo(String value) {
        return new JAXBElement<>(_Info_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FinishId")
    public JAXBElement<String> createFinishId(String value) {
        return new JAXBElement<>(_FinishId_QNAME, String.class, null, value);
    }

}
